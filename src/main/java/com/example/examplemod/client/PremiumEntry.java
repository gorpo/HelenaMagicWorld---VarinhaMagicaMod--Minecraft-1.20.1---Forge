package com.example.examplemod.client;

public class PremiumEntry {

    private final String name;
    private final String englishName;
    private final String category;

    public PremiumEntry(
            String name,
            String englishName,
            String category
    ) {

        this.name = name;
        this.englishName =
                englishName;

        this.category =
                category;
    }

    public String getName() {
        return name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getCategory() {
        return category;
    }

    public String getDisplayName() {

        return name
                + " - "
                + englishName;
    }
}