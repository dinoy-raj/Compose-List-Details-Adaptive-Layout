package com.dino.list

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.dino.list.news.ui.screens.NewsScreen
import org.jetbrains.compose.resources.Font
import listdetailspreview.shared.generated.resources.*

// Forest Green Color Scheme based on the provided image
private val LightForestColorScheme = lightColorScheme(
    primary = Color(0xFF4F6630),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD0EBB0),
    onPrimaryContainer = Color(0xFF111F00),
    secondary = Color(0xFF586249),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFDCE7C8),
    onSecondaryContainer = Color(0xFF151E0B),
    tertiary = Color(0xFF386666),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFBBEBEB),
    onTertiaryContainer = Color(0xFF002020),
    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFF9FAEF),
    onBackground = Color(0xFF1A1C16),
    surface = Color(0xFFF9FAEF),
    onSurface = Color(0xFF1A1C16),
    surfaceVariant = Color(0xFFE1E4D5),
    onSurfaceVariant = Color(0xFF44483E),
    outline = Color(0xFF75796C)
)

private val DarkForestColorScheme = darkColorScheme(
    primary = Color(0xFFB5CF96),
    onPrimary = Color(0xFF223605),
    primaryContainer = Color(0xFF384E1A),
    onPrimaryContainer = Color(0xFFD0EBB0),
    secondary = Color(0xFFC0CBAE),
    onSecondary = Color(0xFF2A331E),
    secondaryContainer = Color(0xFF404A33),
    onSecondaryContainer = Color(0xFFDCE7C8),
    tertiary = Color(0xFFA0CFCF),
    onTertiary = Color(0xFF003737),
    tertiaryContainer = Color(0xFF1E4E4E),
    onTertiaryContainer = Color(0xFFBBEBEB),
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF1A1C16),
    onBackground = Color(0xFFE2E3D8),
    surface = Color(0xFF1A1C16),
    onSurface = Color(0xFFE2E3D8),
    surfaceVariant = Color(0xFF44483E),
    onSurfaceVariant = Color(0xFFC5C8BA),
    outline = Color(0xFF8E9285)
)

@Composable
fun NewsAppTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkForestColorScheme else LightForestColorScheme
    
    val poppinsFontFamily = FontFamily(
        Font(Res.font.Poppins_Thin, FontWeight.Thin, FontStyle.Normal),
        Font(Res.font.Poppins_Light, FontWeight.Light, FontStyle.Normal),
        Font(Res.font.Poppins_Regular, FontWeight.Normal, FontStyle.Normal),
        Font(Res.font.Poppins_Medium, FontWeight.Medium, FontStyle.Normal),
        Font(Res.font.Poppins_SemiBold, FontWeight.SemiBold, FontStyle.Normal),
        Font(Res.font.Poppins_Bold, FontWeight.Bold, FontStyle.Normal),
        Font(Res.font.Poppins_ExtraBold, FontWeight.ExtraBold, FontStyle.Normal),
    )

    val defaultTypography = Typography()
    val typography = Typography(
        displayLarge = defaultTypography.displayLarge.copy(fontFamily = poppinsFontFamily),
        displayMedium = defaultTypography.displayMedium.copy(fontFamily = poppinsFontFamily),
        displaySmall = defaultTypography.displaySmall.copy(fontFamily = poppinsFontFamily),
        headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = poppinsFontFamily),
        headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = poppinsFontFamily),
        headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = poppinsFontFamily),
        titleLarge = defaultTypography.titleLarge.copy(fontFamily = poppinsFontFamily),
        titleMedium = defaultTypography.titleMedium.copy(fontFamily = poppinsFontFamily),
        titleSmall = defaultTypography.titleSmall.copy(fontFamily = poppinsFontFamily),
        bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = poppinsFontFamily),
        bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = poppinsFontFamily),
        bodySmall = defaultTypography.bodySmall.copy(fontFamily = poppinsFontFamily),
        labelLarge = defaultTypography.labelLarge.copy(fontFamily = poppinsFontFamily),
        labelMedium = defaultTypography.labelMedium.copy(fontFamily = poppinsFontFamily),
        labelSmall = defaultTypography.labelSmall.copy(fontFamily = poppinsFontFamily)
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}

@Composable
@Preview
fun App() {
    NewsAppTheme {
        NewsScreen(modifier = Modifier.background(color = MaterialTheme.colorScheme.background))
    }
}
