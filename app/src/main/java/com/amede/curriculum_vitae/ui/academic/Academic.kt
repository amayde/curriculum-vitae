package com.amede.curriculum_vitae.ui.academic

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amede.curriculum_vitae.ui.home.*
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import com.amede.curriculum_vitae.ui.utils.CustomCard
import com.amede.curriculum_vitae.ui.utils.More

@Composable
fun Academic() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Spacer(modifier = Modifier.size(20.dp))

        ImageProfil()

        Spacer(modifier = Modifier.size(20.dp))

        AcademicItem("Master 2", "Hitema - Alternace", "2019", "Développement  logiciel, mobile et objets connectés")

        Spacer(modifier = Modifier.size(20.dp))

        AcademicItem("Licence Professionnel", "Cnam - Alternace", "2017", "Web, mobile et business intelligence")

        Spacer(modifier = Modifier.size(20.dp))

        AcademicItem("BTS", "Lycée parc de Vilgénis", "2015", "Services Informatiques aux Organisations")

        Spacer(modifier = Modifier.size(20.dp))

        AcademicItem("Bac", "Lycée Léonard de Vinci", "2013", "Scientifique")

        Spacer(modifier = Modifier.size(20.dp))
    }
}

@Composable
fun AcademicItem(level: String, name: String, year: String, description: String) {
    CustomCard(modifier = Modifier.fillMaxWidth())
    {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = level, style = MaterialTheme.typography.h3)
            Text(text = name, style = MaterialTheme.typography.h4)
            Text(text = year, style = MaterialTheme.typography.h5)
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurriculumvitaeTheme {
        AcademicItem("Master 2", "Hitema - Alternace", "2019", "Développement  logiciel, mobile et objets connectés")
    }
}