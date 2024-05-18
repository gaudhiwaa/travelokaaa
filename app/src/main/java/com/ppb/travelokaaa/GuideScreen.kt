package com.ppb.travelokaaa

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun Guide(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
//            .requiredWidth(width = 375.dp)
            .fillMaxWidth()
            .requiredHeight(height = 812.dp)
            .background(color = Color(0xfffcfcfd))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 435.dp)
                .requiredWidth(width = 522.dp)

                .requiredHeight(height = 321.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 37.dp)
            ) {
                ArticleCard()
                ArticleCard()
            }
            Text(
                text = "Rp 25.000",
                color = Color.Black,
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 178.dp,
                        y = 204.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "Top-pick articles",
                color = Color(0xff292c3d),
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .offset(x = 0.dp,
                        y = (-296).dp))
        }
        ShadowBottomBar(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .fillMaxWidth()
//                .offset(x = 0.dp,
//                    y = 724.dp)
                    )
        Text(
            text = "Guide",
            color = Color(0xff292c3d),
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 58.dp))
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = "Sightseeing",
                    style = TextStyle(
                        color = Color(0xff189cf4),
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.wrapContentHeight(align = Alignment.CenterVertically)
                )
            },
            placeholder = { Text("Resort", style = TextStyle(color = Color.Gray)) },
            textStyle = TextStyle(
                color = Color(0xff189cf4),
                fontSize = 16.sp
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 6.dp, y = 381.dp)
                .requiredWidth(width = 380.dp)
        )

        LeadingIconTab(
            selected = false,
            onClick = {  },
            text = {
                Text(
                    text = "A country, a city, a place... or anything ",
                    color = Color(0xff52577a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp))
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.hotel),
                    contentDescription = "icon")
            },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 309.dp)
                .requiredWidth(width = 343.dp)
                .requiredHeight(height = 48.dp)
                .clip(shape = MaterialTheme.shapes.medium)
                .border(border = BorderStroke(1.7999999523162842.dp, Color(0xffe0e2eb)),
                    shape = MaterialTheme.shapes.medium)
                .padding(horizontal = 10.dp,
                    vertical = 8.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 120.dp)
                .requiredWidth(width = 343.dp)
                .requiredHeight(height = 165.dp)
        ) {
            Text(
                text = "See all",
                color = Color(0xff189cf4),
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.End,
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .offset(x = (-2).dp,
                        y = 4.dp))
            Text(
                text = "Might need these",
                color = Color(0xff292c3d),
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .offset(x = 0.dp,
                        y = (-139).dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 235.dp,
                        y = 40.dp)
                    .requiredWidth(width = 108.dp)
                    .requiredHeight(height = 125.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(6.dp))
                            .background(color = Color(0xffc4c4c4)))
                }
                Text(
                    text = "Safe Travel",
                    color = Color(0xfffcfcfd),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentHeight(align = Alignment.Bottom))
            }
        }
        NavBar()
    }
}

@Composable
fun ArticleCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .requiredWidth(width = 253.dp)
            .requiredHeight(height = 273.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 161.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp))
                    .background(color = Color(0xffc4c4c4)))
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .offset(x = (-16).dp,
                        y = 16.dp)
                    .clip(shape = RoundedCornerShape(80.dp))
                    .background(color = Color(0xfffcfcfd).copy(alpha = 0.2f))
                    .padding(all = 6.400000095367432.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.hotel),
                    contentDescription = "icon",
                    modifier = Modifier
                        .requiredSize(size = 19.dp))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 111.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp))
                    .background(color = Color(0xfffcfcfd)))
            Text(
                text = "shopping",
                color = Color(0xff189cf4),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 0.dp)
                    .fillMaxHeight()
                    .requiredWidth(width = 135.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "The Ultimate Guide to Shopping for Travel",
                color = Color(0xff181a25),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .fillMaxSize())
        }
    }
}

@Composable
fun ShadowBottomBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 375.dp)
            .requiredHeight(height = 88.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.linearGradient(
                    0f to Color.White,
                    0.71f to Color.White,
                    start = Offset(187.5f, 0f),
                    end = Offset(187.98f, 131f))))
    }
}

@Composable
fun NavBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 13.dp,
                end = 12.dp,
                top = 732.dp,
                bottom = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(x = 0.dp,
                    y = 0.dp)
                .fillMaxWidth()
                .requiredHeight(height = 60.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color.White))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .offset(x = 0.dp,
                    y = 0.dp)
                .fillMaxWidth()
        ) {
            Statusunselect()
            Statusunselect()
            Statusunselect()
            Statusselect()
        }
    }
}
//
//@Composable
//fun Statusunselect(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 68.dp)
//            .requiredHeight(height = 48.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .requiredWidth(width = 68.dp)
//                .requiredHeight(height = 48.dp)
//                .clip(shape = RoundedCornerShape(100.dp)))
//        Image(
//            painter = painterResource(id = R.drawable.icon),
//            contentDescription = "icon",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 18.dp,
//                    y = 8.dp)
//                .requiredSize(size = 32.dp))
//    }
//}
//
//@Composable
//fun Statusselect(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 68.dp)
//            .requiredHeight(height = 48.dp)
//    ) {
//        Box(
//            modifier = Modifier
//                .requiredWidth(width = 68.dp)
//                .requiredHeight(height = 48.dp)
//                .clip(shape = RoundedCornerShape(100.dp))
//                .background(color = Color(0xff189cf4)))
//        Image(
//            painter = painterResource(id = R.drawable.icon),
//            contentDescription = "icon",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 18.dp,
//                    y = 8.dp)
//                .requiredSize(size = 32.dp))
//    }
//}

@Preview(widthDp = 375, heightDp = 812)
@Composable
private fun GuidePreview() {
    Guide(Modifier)
}