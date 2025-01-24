package com.bcan.aitattoogenerator.presentation.ui.sheets

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.bcan.aitattoogenerator.ui.theme.CodGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetHost(
    sheetState: SheetState,
    onDismissRequest: () -> Unit = { BottomSheetController.hide() }
) {
    val sheetData by BottomSheetController.sheetData.collectAsStateWithLifecycle()

    if (sheetData.visibilityState && sheetData.content != null) {
        ModalBottomSheet(
            onDismissRequest = onDismissRequest,
            sheetState = sheetState,
            content = sheetData.content!!,
            containerColor = CodGray
        )
    }
}