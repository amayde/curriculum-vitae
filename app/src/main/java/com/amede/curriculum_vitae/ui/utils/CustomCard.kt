package com.amede.curriculum_vitae.ui.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomCard(
    modifier: Modifier = Modifier.fillMaxWidth(),
    composable: (@Composable () -> Unit)
) {
    androidx.compose.material.Card(
        shape = RoundedCornerShape(6.dp),
        modifier = modifier
    ) {
        composable()
    }
}