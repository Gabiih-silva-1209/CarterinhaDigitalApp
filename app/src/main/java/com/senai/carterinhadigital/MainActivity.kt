package com.senai.carterinhadigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.rafaelcosta.myapplication.QrCode
import com.senai.carterinhadigital.ui.theme.CarterinhaDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarterinhaDigitalTheme {
              //  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }


@Composable
fun CarterinhaDigitalApp( modifier: Modifier = Modifier ){
    Column(
        modifier = modifier,
        horizontalAlignment =  Alignment.CenterHorizontally,
    ){
        Image(
            painter = painterResource(R.drawable.logosenai),
            contentDescription = "Logo SENAI",
            modifier= Modifier.weight(),


        )
        Image(
            painter = painterResource( R.drawable.login),
                    contentDescription = "Foto de Perfil",
            modifier= Modifier.weight(),
        )
        Row(modifier= Modifier.weight()
            ){
            Text( "Nome")
            Text("Gabrieli da Silva Marcelino")
        }
        Row(modifier= Modifier.weight()
        ){
            Text("Curso")
            Text("Tecnico Análise de Desenvolvimento de Sistemas")

        }
        QrCode("90000000001417015720",
            modifier= Modifier.weight()

        )
    }
}
