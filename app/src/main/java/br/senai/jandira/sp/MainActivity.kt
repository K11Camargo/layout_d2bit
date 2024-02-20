package br.senai.jandira.sp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.material.icons.sharp.Face
import androidx.compose.material.icons.sharp.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.jandira.sp.ui.theme.Caixa_De_TextoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Caixa_De_TextoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(8.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFF3F51B5))
        ) {
            Column (
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                            Text(text = "Nome do Usuario")
                    },
                    leadingIcon = {
                            Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = ""
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedTextColor = Color.White,
                            focusedTextColor = Color.Yellow,
                            unfocusedBorderColor = Color.Magenta,
                            focusedBorderColor = Color(0xFFFF5722)
                        )

                )
                Spacer(modifier = Modifier.height(16.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Build,
                            contentDescription = "Ferramenta"
                        )
                    },
                    placeholder = {
                        Text(text = "Digite aqui etc e tal")
                    }
                )
                Button(onClick = { /*TODO*/ }) {
                    
                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Caixa_De_TextoTheme {
        Greeting()
    }
}