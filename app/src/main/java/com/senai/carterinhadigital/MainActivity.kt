package com.senai.carterinhadigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode
import com.senai.carterinhadigital.ui.theme.CarterinhaDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarterinhaDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarterinhaDigitalApp(
                        modifier = Modifier
                            .padding( innerPadding)
                            .fillMaxSize()
                    )

                }
            }
        }
    }
}

@Composable
fun CarterinhaDigitalApp( modifier: Modifier = Modifier ){
    Box(){
        Image(
            painter = painterResource( R.drawable.stichfundo),
            contentDescription = "Fundo da Carteirinha",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
    Column(
        modifier = modifier,
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        Image(
            painter = painterResource(R.drawable.logosenai),
            contentDescription = "Logo SENAI",
            modifier= Modifier
                .weight(.5f)
            .padding(top= 10.dp)
            .fillMaxWidth(.7f) // fração




        )
        Image(
            painter = painterResource( R.drawable.login),
                    contentDescription = "Foto de Perfil",
            contentScale = ContentScale.Crop,
            modifier= Modifier
                .weight(.5f)
                //.size(200.dp)
                .clip(CircleShape)
                .aspectRatio(1f)
                .fillMaxWidth(.8f)
                .background(color = Color.Red)
        )
        Spacer(
            modifier = Modifier
                .weight(.3f)
        )

    Row(modifier= Modifier.weight(.5f)
            ){
          Text( "Nome: ")
        /*    Text("Gabrieli da Silva Marcelino")*/

        Valuetext(
            value = "Gabrieli da Silva Marcelino",
            modifier = Modifier.weight(4f)
        )
        }
        Row(modifier= Modifier.
        weight(3f)
            .fillMaxWidth(.6f)
        ){
            Text("Curso: ",
            textAlign = TextAlign.Right,
            style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(1f)
            )

            /*Text( "Tecnico Análise de Desenvolvimento de Sistemas",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontFamily = MaterialTheme.typography.titleLarge.fontFamily,
                lineHeight = MaterialTheme.typography.titleLarge.lineHeight,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(4f),
                softWrap = true,
                color = MaterialTheme.colorScheme.onSurface  // cor do texto

            )*/
            Valuetext(
                value = "Técnico em Análise de Desenvolvimento de Sistemas",
                fontWeight = FontWeight.Normal,
                modifier = Modifier.weight(4f),
                fontSize = 25.sp,


            )

        }

        Button(
            onClick = {}
        ) {
            Text("Aperte aqui")
        }
        TextField(

        )
        QrCode("90000000001417015720",
            modifier= Modifier
                .weight(3f)
                .fillMaxWidth(.6f)
                //.clip()

        )
    }
}

@Preview( // possibildade de ver as duas versões simuntaneas
    showBackground = true,
    showSystemUi = true
)

@Composable
fun  PreviewCarterinhaDigitalAppClaro(){
    CarterinhaDigitalTheme(darkTheme = false) {
        CarterinhaDigitalApp( modifier = Modifier.padding(16.dp))
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewCarterinhaDigitalAppEscuro(){
    CarterinhaDigitalTheme(darkTheme = true) {
        CarterinhaDigitalApp(modifier = Modifier.padding(16.dp))
    }
}
