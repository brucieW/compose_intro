package com.zeroboss.composeintroduction.ui.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.zeroboss.composeintroduction.R

enum class ComputerLanguage(
    val languageName: String,
    val relativeUsage: Usage,
    val notes: String
) {
    Python(
        "Python",
        Usage.VeryHigh,
        "Python consistently ranks at or near the top of most usage and popularity metrics due to its versatility in web development, data science, and machine learning."
    ),
    JavaScript(
        "JavaScript",
        Usage.VeryHigh,
        "JavaScript remains the most widely used language for web development, both on the client-side (front-end) and server-side (Node.js)."
    ),
    Java(
        "Java",
        Usage.High,
        "Java continues to be heavily used in enterprise environments, Android development, and large-scale systems."
    ),
    C(
        "C",
        Usage.High,
        "C is still widely used for system programming, embedded systems, and applications requiring high performance."
    ),
    CPLusPlus(
        "C++",
        Usage.High,
        "C++ remains popular in game development, high-performance applications, and system software."
    ),
    CSharp(
        "C#",
        Usage.VeryHigh,
        "C# is popular for enterprise applications, especially those running on the .NET framework, and in game development with Unity.",
    ),
    PHP(
        "PHP",
        Usage.ModerateToHigh,
        "PHP is widely used for web development, especially with content management systems like WordPress."
    ),
    Swift(
        "Swift",
        Usage.Moderate,
        "Swift is widely used for iOS and macOS app development but is niche compared to languages like Python and JavaScript."
    ),
    Ruby(
        "Ruby",
        Usage.Moderate,
        "Ruby is popular in web development, especially with the Ruby on Rails framework, but its overall usage is lower than JavaScript or Python."
    ),
    Go(
        "Go",
        Usage.Moderate,
        "Go is gaining popularity for cloud services, backend development, and system programming."
    ),
    Kotlin(
        "Kotlin",
        Usage.Growing,
        "Kotlin is increasingly used for Android development, often preferred over Java for new projects."
    ),
    TypeScript(
        "TypeScript",
        Usage.Growing,
        "TypeScript's popularity is rising rapidly, especially for large-scale JavaScript applications and modern web development.",
    ),
    SQL(
        "SQL",
        Usage.VeryHigh,
        "SQL is indispensable for database management and is universally used across various applications."
    ),
    Rust(
        "Rust",
        Usage.Growing,
        "Rust is becoming popular for system programming and applications requiring safety and performance."
    ),
    MATLAB(
        "MATLAB",
        Usage.Niche,
        "MATLAB is widely used in academia and industries that require technical computing."
    ),
    Scala(
        "Scala",
        Usage.Moderate,
        "Scala is used in data processing and distributed computing, often in big data applications."
    ),
    Perl(
        "Perl",
        Usage.Declining,
        "Perl's usage has declined significantly but is still used for legacy systems and scripting."
    ),
    Haskell(
        "Haskell",
        Usage.Niche,
        "Haskell is mainly used in academia and among functional programming enthusiasts."
    ),
    ObjectiveC(
        "Objective C",
        Usage.Declining,
        "Objective-C is still used for legacy iOS/macOS applications but is largely replaced by Swift."
    );

    companion object {
        @Composable
        fun getImage(language: ComputerLanguage) : Painter {
            return when (language) {
                Python -> painterResource(id = R.drawable.python)
                JavaScript -> painterResource(id = R.drawable.java_script)
                Java -> painterResource(id = R.drawable.java)
                C -> painterResource(id = R.drawable.c)
                CPLusPlus -> painterResource(id = R.drawable.cplusplus)
                CSharp -> painterResource(id = R.drawable.csharp)
                PHP -> painterResource(id = R.drawable.php)
                Swift -> painterResource(id = R.drawable.swift)
                Ruby -> painterResource(id = R.drawable.ruby)
                Go -> painterResource(id = R.drawable.go)
                Kotlin -> painterResource(id = R.drawable.kotlin)
                TypeScript -> painterResource(id = R.drawable.typescript)
                SQL -> painterResource(id = R.drawable.sql)
                Rust -> painterResource(id = R.drawable.rust)
                MATLAB -> painterResource(id = R.drawable.matlab)
                Scala -> painterResource(id = R.drawable.scala)
                Perl -> painterResource(id = R.drawable.perl)
                Haskell -> painterResource(id = R.drawable.haskell)
                ObjectiveC -> painterResource(id = R.drawable.objectivec)
            }
        }
    }
}

enum class Usage(val text: String) {
    VeryHigh("Very High"),
    High("High"),
    ModerateToHigh("Moderate to High"),
    Moderate("Moderate"),
    Growing("Growing"),
    Niche("Niche"),
    Declining("Declining")
}



