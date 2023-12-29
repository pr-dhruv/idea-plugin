package com.soma.plugin.first

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class InputDialogAction: AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        var value = Messages.showInputDialog(e.project, "Enter your message", "Data", Messages.getInformationIcon())
        if (value.isNullOrEmpty())
            value = "EMPTY_VALUE"
        Messages.showMessageDialog(e.project, "$value", "Input Value", Messages.getInformationIcon())
    }
}