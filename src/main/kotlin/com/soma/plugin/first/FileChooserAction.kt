package com.soma.plugin.first

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.fileChooser.FileChooser
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.ui.Messages
import com.intellij.util.Consumer

class FileChooserAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        showFileChooser(e)
    }

    /**
     * 1st Flag: Choose Files
     * 2nd Flag: Choose Folders
     * 3rd Flag: Choose Jars
     * 4th Flag: Choose Jars as Files
     * 5th Flag: Choose Jar Content
     * 6th Flag: Choose Multiple
     */
    private fun showFileChooser(e: AnActionEvent) {
        val fileChooserDescriptor = FileChooserDescriptor(
                true,
                true,
                false,
                false,
                false,
                false)
        fileChooserDescriptor.title = "Pick Directory"
        fileChooserDescriptor.description = "File chooser test"

        FileChooser.chooseFile(fileChooserDescriptor, e.project, null, Consumer {
            Messages.showMessageDialog(e.project, it.path, "Selected Path", Messages.getInformationIcon())
        })
    }
}