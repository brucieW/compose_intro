package com.zeroboss.composeintroduction.ui.screens

enum class ComputerLanguage(relativeUsage: Usage, notes: String) {
    Python(
        Usage.VeryHigh,
        "Python consistently ranks at or near the top of most usage and popularity metrics due to its versatility in web development, data science, and machine learning."
    ),
    JavaScript(
        Usage.VeryHigh,
        "JavaScript remains the most widely used language for web development, both on the client-side (front-end) and server-side (Node.js)."
    ),
    Java(
        Usage.High,
        "Java continues to be heavily used in enterprise environments, Android development, and large-scale systems."
    ),
    C(
        Usage.High,
        "C is still widely used for system programming, embedded systems, and applications requiring high performance."
    ),
    CPLusPlus(
        Usage.High,
        "C++ remains popular in game development, high-performance applications, and system software."
    ),
    CSharp(
        Usage.VeryHigh,
        "C# is popular for enterprise applications, especially those running on the .NET framework, and in game development with Unity.",
    ),
    PHP(
        Usage.ModerateToHigh,
        "PHP is widely used for web development, especially with content management systems like WordPress."
    ),
    R(
        Usage.Moderate,
        "R is popular in academic and research settings, particularly for statistical computing and data analysis."
    ),
    Swift(
        Usage.Moderate,
        "Swift is widely used for iOS and macOS app development but is niche compared to languages like Python and JavaScript."
    ),
    Ruby(
        Usage.Moderate,
        "Ruby is popular in web development, especially with the Ruby on Rails framework, but its overall usage is lower than JavaScript or Python."
    ),
    Go(
        Usage.Moderate,
        "Go is gaining popularity for cloud services, backend development, and system programming."
    ),
    Kotlin(
        Usage.Growing,
        "Kotlin is increasingly used for Android development, often preferred over Java for new projects."
    ),
    TypeScript(
        Usage.Growing,
        "TypeScript's popularity is rising rapidly, especially for large-scale JavaScript applications and modern web development.",
    ),
    SQL(
        Usage.VeryHigh,
        "SQL is indispensable for database management and is universally used across various applications."
    ),
    Rust(
        Usage.Growing,
        "Rust is becoming popular for system programming and applications requiring safety and performance."
    ),
    MATLAB(
        Usage.Niche,
        "MATLAB is widely used in academia and industries that require technical computing."
    ),
    Scala(
        Usage.Moderate,
        "Scala is used in data processing and distributed computing, often in big data applications."
    ),
    Perl(
        Usage.Declining,
        "Perl's usage has declined significantly but is still used for legacy systems and scripting."
    ),
    Haskell(
        Usage.Niche,
        "Haskell is mainly used in academia and among functional programming enthusiasts."
    ),
    ObjectiveC(
        Usage.Declining,
        "Objective-C is still used for legacy iOS/macOS applications but is largely replaced by Swift."
    )
}

enum class Usage(text: String) {
    VeryHigh("Very High"),
    High("High"),
    ModerateToHigh("Moderate to High"),
    Moderate("Moderate"),
    Growing("Growing"),
    Niche("Niche"),
    Declining("Declining")
}


