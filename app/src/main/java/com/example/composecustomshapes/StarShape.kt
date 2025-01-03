package com.example.composecustomshapes

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

data object StarShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            path = Path().apply {
                val halfWidth = size.width / 2f
                val pointWidth = size.width / 10f
                val pointHeight = size.height / 10f
                moveTo(x = halfWidth, y = 0f)
                lineTo(x = halfWidth + (1.5f * pointWidth), y = (pointHeight * 3.5f))
                lineTo(x = size.width, y = (pointHeight * 3.5f))
                lineTo(x = halfWidth + (2f * pointWidth), y = (pointHeight * 6f))
                lineTo(x = halfWidth + (3.5f * pointWidth), y = size.height)
                lineTo(x = halfWidth, y = (8f * pointHeight))
                lineTo(x = halfWidth - (3.5f * pointWidth), y = size.height)
                lineTo(x = halfWidth - (2f * pointWidth), y = (pointHeight * 6f))
                lineTo(x = 0f, y = (3.5f * pointHeight))
                lineTo(x = halfWidth - (1.5f * pointWidth), y = (3.5f * pointHeight))
                close()
            }
        )
    }
}