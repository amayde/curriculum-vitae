package com.amede.curriculum_vitae.ui.academic

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amede.curriculum_vitae.ui.home.*
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import com.amede.curriculum_vitae.ui.utils.CustomCard

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

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column {
                Divider(
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .width(1.dp)
                        .height(2.dp)
                )
                Spacer(modifier = Modifier.size(2.dp))
                Divider(
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .width(1.dp)
                        .height(5.dp)
                )
                Spacer(modifier = Modifier.size(5.dp))
                Divider(
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .width(1.dp)
                        .height(20.dp)
                )
            }
        }

        AcademicItem(
            "Master 2",
            "Hitema - Alternace",
            "2019",
            "Développement  logiciel, mobile et objets connectés"
        )

        TimeSpacer()

        AcademicItem(
            "Licence Professionnel",
            "Cnam - Alternace",
            "2017",
            "Web, mobile et business intelligence"
        )

        TimeSpacer()

        AcademicItem(
            "BTS",
            "Lycée parc de Vilgénis",
            "2015",
            "Services Informatiques aux Organisations"
        )

        TimeSpacer()

        AcademicItem("Bac", "Lycée Léonard de Vinci", "2013", "Scientifique")

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column {
                Divider(
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .width(1.dp)
                        .height(20.dp)
                )
                Spacer(modifier = Modifier.size(5.dp))
                Divider(
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .width(1.dp)
                        .height(5.dp)
                )
                Spacer(modifier = Modifier.size(2.dp))
                Divider(
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier
                        .width(1.dp)
                        .height(2.dp)
                )
            }
        }

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

@Composable
fun TimeSpacer() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Divider(
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .width(1.dp)
                .height(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurriculumvitaeTheme {
        AcademicItem(
            "Master 2",
            "Hitema - Alternace",
            "2019",
            "Développement  logiciel, mobile et objets connectés"
        )
    }
}