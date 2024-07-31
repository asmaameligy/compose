package com.app.details.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Scaffold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.details.R
import androidx.compose.material3.TopAppBar as TopAppBar1



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScreen() {
    Scaffold(
         topBar = {
             TopAppBar1(
                 title = {
                 Text(
                     text = "Details",
                     fontSize = 18.sp)
             },
                 navigationIcon   = {
                     IconButton(onClick = { /*TODO*/ }) {
                         Icon(
                             imageVector = Icons.Default.ArrowBack,
                             contentDescription = "Go Back"
                         )
                     }
                 })
    }
    )
}

@Composable
fun DetailsScreen(){
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.google) ,
            contentDescription ="Google Logo",
            modifier=Modifier.size(150.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "language",
            fontSize = 18.sp,
            fontWeight = FontWeight.Black
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ){
            Text(text = "1525")

            Spacer(modifier = Modifier.width(4.dp))

            Icon(painter = painterResource(id = R.drawable.ic_star) ,
                contentDescription ="stars",
                tint = Color.Yellow)

            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "Python")
            Spacer(modifier = Modifier.width(4.dp))

            Icon(painter = painterResource(id = R.drawable.ic_circle) ,
                contentDescription ="Circle",
                tint = Color.Blue)

            Spacer(modifier = Modifier.width(16.dp))

            Text(text = "347")

            Spacer(modifier = Modifier.width(4.dp))

            Icon(painter = painterResource(id = R.drawable.ic_fork) ,
                contentDescription ="Fork",
                tint = Color.Black)
        }

        Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Shared repository for open-sourced projects from the Google AI Language team.",
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxSize()
            )
            {
                Text(text = "Show Issues",
                    color = Color.White)
            }
    }
}




@Composable
fun Scaffold(topBar: @Composable () -> Unit) {

}






