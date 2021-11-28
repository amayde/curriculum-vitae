package com.amede.curriculum_vitae.ui.experiences

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
import com.amede.curriculum_vitae.ui.academic.TimeSpacer
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import com.amede.curriculum_vitae.ui.utils.CustomCard

@Composable
fun Experiences() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
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

        ExperienceItem(
            titre = "Développeur Android - CDI",
            business = "Adscientiam",
            duration = "Mars 2020 - À ce jour",
            description = "À ce jour je suis développeur android au sein d'une start-up du domaine médical. J'interviens au sein d'une petite équipe android de 3 personnes, nous développons des applications de suivis des patients atteints de maladie incurable (tel que la sclérose en plaques)."
        )

        TimeSpacer()

        ExperienceItem(
            titre = "Développeur Android - Freelance",
            business = "Freelance",
            duration = "Mars 2019 - Mars 2020",
            description = "En parallèle de mon alternance j'ai travaillé en tant que développeur mobile en freelance. J'ai construis de petites applications pour différents clients."
        )

        TimeSpacer()

        ExperienceItem(
            titre = "Développeur Android/Fullstack - Alternance",
            business = "TeamGeny",
            duration = "Sept. 2018 - Sept. 2019",
            description = "J'ai travaillé en tant que développeur fullstack (mobile et backend) en alternance chez TeamGeny, qui est une très petite entreprise de consulting (2 personnes) en télétravail. Au sein de TeamGeny j'ai développé mes compétences sur plusieurs aspects du développement mobile, de la définition du besoin avec le client jusqu'à la mise en production de différentes applications (Qwitt, Charge, Morphin, ...)."
        )

        TimeSpacer()

        ExperienceItem(
            titre = "Développeur C#/ Swift - Alternance",
            business = "Oodrive",
            duration = "Mai 2016 - Sept. 2018",
            description = "J'étais développeur client lourd (Windows - C# et MacOS - Swift) en alternance chez Oodrive (éditeur de logiciel cloud de 350 employés). J'ai entre autre participé au développement et à la maintenance de différents produits dans un cadre agile (Scrum). Durant cette période j'ai contribué également à plusieurs autres projets (TDD, Test fonctionnel automatisé, ...)."
        )

        TimeSpacer()

        ExperienceItem(
            titre = "Développeur VB.Net - Stage",
            business = "Oodrive",
            duration = "Mars 2014 - Mai 2014",
            description = "Développement d'un outil d'historisation des données d'un laboratoire en VB.net avec la méthode eXtreme Programming."
        )

        TimeSpacer()

        ExperienceItem(
            titre = "Développeur SQL - Stage",
            business = "GFI Informatique",
            duration = "Mars 2013 - Mai 2013",
            description = "Extraction de données pour les contrôleurs de gestion sur le PGI (Sage)."
        )

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
fun ExperienceItem(titre: String, business: String, duration: String, description: String) {
    CustomCard(
        modifier = Modifier
            .fillMaxWidth()
    )
    {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = titre, style = MaterialTheme.typography.h3)
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = duration,
                style = MaterialTheme.typography.h4
            )
            Text(
                text = business,
                style = MaterialTheme.typography.h5
            )
            Spacer(modifier = Modifier.size(15.dp))
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
        ExperienceItem(
            titre = "Développeur Android - CDI",
            business = "Adscientiam",
            duration = "Mars 2020 - À ce jour",
            description = "À ce jour je suis développeur android au sein d'une start-up du domaine médical. J'interviens au sein d'une petite équipe android de 3 personnes, nous développons des applications de suivis des patients atteints de maladie incurable (tel que la sclérose en plaques)."
        )
    }
}