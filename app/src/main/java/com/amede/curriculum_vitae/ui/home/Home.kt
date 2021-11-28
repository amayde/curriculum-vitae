package com.amede.curriculum_vitae.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amede.curriculum_vitae.R
import com.amede.curriculum_vitae.ui.profil.Contact
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import com.amede.curriculum_vitae.ui.utils.CustomCard

@Composable
fun Home() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        ImageProfil()
        Spacer(modifier = Modifier.size(20.dp))
        Introduction()

        // TODO COMPETENCES & APTITUDES
        // TODO ACADEMIC
        // TODO EXPERIENCES

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
                }
            }
        }
    }
}

@Composable
fun Introduction() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(text = "Introduction", style = MaterialTheme.typography.h4)
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "Je suis un développeur android  qui a acquis de l'expérience professionnelle grâce à mon parcours varié. Depuis plus de trois ans je me spécialise dans le développement android, je souhaite étoffer mes compétences dans ce domaine et m'épanouir au sein d'une équipe agile.",
                style = MaterialTheme.typography.body1
            )

        }
    }
}

@Composable
fun Language() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(text = "Langues", style = MaterialTheme.typography.h4)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Français", resourceId = R.drawable.ic_french)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Anglais", resourceId = R.drawable.ic_english)

            Spacer(modifier = Modifier.size(5.dp))
            IconText(text = "Espagnol", resourceId = R.drawable.ic_spanish)
        }
    }
}


@Composable
fun Hobbies() {
    CustomCard {
        Column(modifier = Modifier.padding(20.dp)) {

            Text(text = "Loisirs", style = MaterialTheme.typography.h4)

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
fun IconText(text: String, resourceId: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(id = resourceId),
            contentDescription = "link",
            tint = MaterialTheme.colors.onBackground,
            modifier = Modifier.size(30.dp)
        )

        Spacer(modifier = Modifier.size(10.dp))

        Text(text = text, style = MaterialTheme.typography.body1)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurriculumvitaeTheme {
        IconText("asfdsf", R.drawable.ic_spanish)
    }
}