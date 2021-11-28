package com.amede.curriculum_vitae.ui.skills

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amede.curriculum_vitae.ui.home.ImageProfil
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import com.amede.curriculum_vitae.ui.utils.CustomCard
import com.amede.curriculum_vitae.ui.utils.SimpleFlowRow

@Composable
fun Skills() {
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

        SkillItem("Langages", tagsLanguage)

        Spacer(modifier = Modifier.size(20.dp))

        SkillItem("Android", tagsAndroid)

        Spacer(modifier = Modifier.size(20.dp))

        SkillItem("Agile", tagsAgile)

        Spacer(modifier = Modifier.size(20.dp))

        SkillItem("Autre", tagsOther)

        Spacer(modifier = Modifier.size(20.dp))
    }
}

@Composable
fun SkillItem(category: String, tags: List<String>) {

    val listColor = listOf(
        MaterialTheme.colors.primary,
        MaterialTheme.colors.primaryVariant,
        MaterialTheme.colors.secondary,
        MaterialTheme.colors.secondaryVariant,
    )
    CustomCard(modifier = Modifier.fillMaxWidth())
    {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = category, style = MaterialTheme.typography.h3)

            Spacer(modifier = Modifier.size(20.dp))

            SimpleFlowRow(
                verticalGap = 8.dp,
                horizontalGap = 8.dp,
                alignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                for (tag in tags) {
                    Text(
                        text = "$tag",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .background(listColor.random(), RoundedCornerShape(4.dp))
                            .padding(4.dp)
                    )
                }
            }
        }
    }
}

private val tagsLanguage = listOf(
    "KotlinJVM",
    "KotlinNative",
    "Java",
    "Swift",
    "C#",
    "Javascript",
)

private val tagsAndroid = listOf(
    "KotlinJVM",
    "Java",
    "KMM",
    "Koin",
    "Hilt",
    "MVVM",
    "Coroutines",
    "Flow",
    "Compose",
    "Room",
    "Dokka",
    "Sensors",
    "Firebase",
)

private val tagsAgile = listOf(
    "Scrum", "Kanban", "TDD", "ATDD", "eXtreme Programming",
)

private val tagsOther = listOf(
    "Git", "CI", "CD", "Jenkins", "CircleCI", "Gitlab", "Azure Devops", "React", "Express", "Ktor", "Sonarqube",
)

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurriculumvitaeTheme {
        SkillItem("Android", tagsAndroid)
    }
}
