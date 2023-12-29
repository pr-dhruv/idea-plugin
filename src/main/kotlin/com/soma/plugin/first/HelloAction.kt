package com.soma.plugin.first

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        showMessageDialog(e)
    }


    private fun showMessageDialog(e: AnActionEvent) {
        Messages.showMessageDialog(e.project,
                "Hello, world!",
                "Plugin Demo",
                Messages.getInformationIcon())
    }
}