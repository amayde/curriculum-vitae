package com.amede.curriculum_vitae.ui.profil

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amede.curriculum_vitae.R
import com.amede.curriculum_vitae.ui.theme.CurriculumvitaeTheme
import android.content.Intent
import android.net.Uri
import androidx.compose.material.*
import com.amede.curriculum_vitae.ui.utils.CustomCard

// TODO ADD CONTACT

@Composable
fun Contact() {
    val context = LocalContext.current

    CustomCard {
        Column {
            Row(
                modifier = Modifier.padding(20.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ademe),
                    contentDescription = "avatar",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colors.onSurface)
                )

                Spacer(modifier = Modifier.size(15.dp))

                Column {
                    Text(text = "Antoine Averlant", style = MaterialTheme.typography.h4)
                    Link("averlant.antoine@gmail.com", R.drawable.ic_mail) {
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            flags = Intent.FLAG_ACTIVITY_NEW_TASK
                            type = "text/email"
                            putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("averlant.antoine@gmail.com")
                            )
                            putExtra(Intent.EXTRA_SUBJECT, "Prise de contact")
                        }
                        context.startActivity(intent)
                    }
                    Link("Antoine Averlant", R.drawable.ic_linkedin) {
                        context.startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.linkedin.com/in/antoine-averlant-36b76714b")
                            )
                        )
                    }
                    Link("amedeniltok", R.drawable.ic_github) {
                        context.startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://github.com/amedeniltok")
                            )
                        )
                    }
                    Link("06 00 00 00 00", R.drawable.ic_phone) {
                        val intent = Intent(Intent.ACTION_DIAL)
                        intent.data = Uri.parse("tel:+33672096544")
                        context.startActivity(intent)
                    }
                }
            }
        }
    }
}

@Composable
fun Link(text: String, resourceId: Int, action: (() -> Unit)? = null) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp)
            .clickable {
                action?.invoke()
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(id = resourceId),
            contentDescription = "link",
            tint = MaterialTheme.colors.onBackground,
            modifier = Modifier
                .size(15.dp)
                .fillMaxHeight()
        )

        Spacer(modifier = Modifier.size(10.dp))

        Text(text = text, style = MaterialTheme.typography.body2)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurriculumvitaeTheme {
        Contact()
    }
}