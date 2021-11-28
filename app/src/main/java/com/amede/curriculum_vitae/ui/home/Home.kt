package com.amede.curriculum_vitae.ui.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.amede.curriculum_vitae.R
import com.amede.curriculum_vitae.ui.profil.Contact
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import com.amede.curriculum_vitae.ui.utils.CustomCard
import com.amede.curriculum_vitae.ui.utils.More
import com.amede.curriculum_vitae.utils.getAge

@Composable
fun Home(skillsAction: () -> Unit, academicAction: () -> Unit, experiencesAction: () -> Unit) {
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

        Introduction()

        Spacer(modifier = Modifier.size(20.dp))

        Experiences(experiencesAction)

        Spacer(modifier = Modifier.size(20.dp))

        SkillsHome(skillsAction)

        Spacer(modifier = Modifier.size(20.dp))

        AcademicHome(academicAction)

        Spacer(modifier = Modifier.size(20.dp))

        Ability()

        Spacer(modifier = Modifier.size(20.dp))

        Language()

        Spacer(modifier = Modifier.size(20.dp))

        Hobbies()

        Spacer(modifier = Modifier.size(20.dp))

        Contact()

        Spacer(modifier = Modifier.size(20.dp))
    }
}

@Composable
fun ImageProfil() {
    CustomCard {
        Column {
            Row(
                modifier = Modifier.padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ademe),
                    contentDescription = "avatar",
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.onSurface)
                )

                Spacer(modifier = Modifier.size(15.dp))
                Column {
                    Text(text = "Antoine Averlant", style = MaterialTheme.typography.h4)
                    Text(text = "Développeur Android", style = MaterialTheme.typography.h5)
                    Text(text = "${getAge()} ans", style = MaterialTheme.typography.h5)
                }
            }
        }
    }
}

@Composable
fun Introduction() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = "Introduction", style = MaterialTheme.typography.h3)
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "Je suis un développeur android  qui a acquis de l'expérience professionnelle grâce à mon parcours varié.\nDepuis plus de trois ans je me spécialise dans le développement android, je souhaite étoffer mes compétences dans ce domaine et m'épanouir au sein d'une équipe agile.",
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Composable
fun Experiences(experiencesAction: () -> Unit) {
    CustomCard(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            experiencesAction()
        })
    {
        Column(modifier = Modifier.padding(20.dp)) {
            TitleNext("Emplois")
            Spacer(modifier = Modifier.size(5.dp))

            Text(text = "Développeur Android - CDI", style = MaterialTheme.typography.h4)
            Text(text = "Adscientiam | Mars 2020 - À ce jour", style = MaterialTheme.typography.h5)
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "À ce jour je suis développeur android au sein d'une start-up du domaine médical. J'interviens au sein d'une petite équipe android de 3 personnes, nous développons des applications de suivis des patients atteints de maladie incurable (tel que la sclérose en plaques).",
                style = MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.size(15.dp))
            More()
        }
    }
}

@Composable
fun SkillsHome(skillsAction: () -> Unit) {
    CustomCard(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            skillsAction()
        })
    {
        Column(modifier = Modifier.padding(20.dp)) {
            TitleNext("Compétences")
            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Android", resourceId = R.drawable.ic_android, size = 25.dp)
            IconText(text = "Kotlin", resourceId = R.drawable.ic_kotlin, size = 25.dp)
            IconText(text = "Agile", resourceId = R.drawable.ic_gear2, size = 25.dp)
            IconText(text = "Autre", resourceId = R.drawable.ic_more, size = 25.dp)
        }
    }
}

@Composable
fun AcademicHome(academicAction: () -> Unit) {
    CustomCard(modifier = Modifier
        .fillMaxWidth()
        .clickable {
            academicAction()
        })
    {
        Column(modifier = Modifier.padding(20.dp)) {
            TitleNext("Formation")
            Spacer(modifier = Modifier.size(5.dp))

            Text(text = "Master 2 - Hitema - Alternace", style = MaterialTheme.typography.h4)
            Text(text = "2019", style = MaterialTheme.typography.h5)
            Text(
                text = "Développement  logiciel, mobile et objets connectés",
                style = MaterialTheme.typography.body1
            )

            Spacer(modifier = Modifier.size(15.dp))
            More()
        }
    }
}

@Composable
fun Ability() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(text = "Aptitudes", style = MaterialTheme.typography.h3)
            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Force de proposition", resourceId = R.drawable.ic_aim, size = 25.dp)
            IconText(text = "Autonome", resourceId = R.drawable.ic_gear, size = 25.dp)
            IconText(text = "Dynamique", resourceId = R.drawable.ic_energy, size = 25.dp)
            IconText(text = "Collaboratif", resourceId = R.drawable.ic_team, size = 25.dp)
            IconText(text = "Passioné", resourceId = R.drawable.ic_heart, size = 25.dp)
            IconText(text = "Curieux", resourceId = R.drawable.ic_idea, size = 25.dp)
        }
    }
}

@Composable
fun Language() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(text = "Langues", style = MaterialTheme.typography.h3)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Français", resourceId = R.drawable.ic_french)
            Row {
                Spacer(modifier = Modifier.size(30.dp))
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = "• Langue natale")
            }

            IconText(text = "Anglais", resourceId = R.drawable.ic_english)
            Row {
                Spacer(modifier = Modifier.size(30.dp))
                Spacer(modifier = Modifier.size(10.dp))
                Column {
                    Text(text = "• Très bon niveau de compréhension")
                    Text(text = "• Bon niveau oral")
                    Text(text = "• Bon niveau écrit")
                }
            }
            IconText(text = "Espagnol", resourceId = R.drawable.ic_spanish)
            Row {
                Spacer(modifier = Modifier.size(30.dp))
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = "• Quelques notions")
            }
        }
    }
}


@Composable
fun Hobbies() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(text = "Loisirs", style = MaterialTheme.typography.h3)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Skateboard", resourceId = R.drawable.ic_skateboard)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Snownoard", resourceId = R.drawable.ic_snowboard)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Vélo", resourceId = R.drawable.ic_bicycle)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Dessin", resourceId = R.drawable.ic_pen)
        }
    }
}

@Composable
fun TitleNext(title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Row {
                Text(text = title, style = MaterialTheme.typography.h3)
            }
        }
        Column {
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_next),
                    contentDescription = "next",
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.size(15.dp)
                )
            }
        }
    }
}

@Composable
fun IconText(text: String, resourceId: Int, size: Dp = 30.dp) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(id = resourceId),
            contentDescription = "icon",
            tint = MaterialTheme.colors.onBackground,
            modifier = Modifier.size(size)
        )

        Spacer(modifier = Modifier.size(10.dp))

        Text(text = text, style = MaterialTheme.typography.body1)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurriculumvitaeTheme {
        AcademicHome({})
    }
}