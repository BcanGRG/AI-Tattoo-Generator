package com.bcan.aitattoogenerator.presentation.ui.sheets

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

typealias SheetContent = @Composable ColumnScope.() -> Unit

data class BottomSheetData(
    var content: SheetContent? = null,
    var visibilityState: Boolean = false,
)

object BottomSheetController {

    private val _sheetData: MutableStateFlow<BottomSheetData> = MutableStateFlow(BottomSheetData())
    val sheetData: StateFlow<BottomSheetData> = _sheetData.asStateFlow()


    fun show(
        content: SheetContent
    ) {
        hide()
        _sheetData.update { state ->
            state.copy(
                content = content,
                visibilityState = true
            )
        }
    }

    fun hide() {
        _sheetData.update { state ->
            state.copy(
                content = null,
                visibilityState = false
            )
        }
    }
}
