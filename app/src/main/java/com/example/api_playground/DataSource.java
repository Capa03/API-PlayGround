package com.example.api_playground;

public class DataSource {
    private static final String RESPONSE = "{\n" +
            "  \"count\": 82,\n" +
            "  \"next\": \"https://swapi.dev/api/people/?page=2&format=json\",\n" +
            "  \"previous\": null,\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"name\": \"Luke Skywalker\",\n" +
            "      \"height\": \"172\",\n" +
            "      \"mass\": \"77\",\n" +
            "      \"hair_color\": \"blond\",\n" +
            "      \"skin_color\": \"fair\",\n" +
            "      \"eye_color\": \"blue\",\n" +
            "      \"birth_year\": \"19BBY\",\n" +
            "      \"gender\": \"male\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/2/\",\n" +
            "        \"https://swapi.dev/api/films/3/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \"https://swapi.dev/api/vehicles/14/\",\n" +
            "        \"https://swapi.dev/api/vehicles/30/\"\n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \"https://swapi.dev/api/starships/12/\",\n" +
            "        \"https://swapi.dev/api/starships/22/\"\n" +
            "      ],\n" +
            "      \"created\": \"2014-12-09T13:50:51.644000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:56.891000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/1/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"C-3PO\",\n" +
            "      \"height\": \"167\",\n" +
            "      \"mass\": \"75\",\n" +
            "      \"hair_color\": \"n/a\",\n" +
            "      \"skin_color\": \"gold\",\n" +
            "      \"eye_color\": \"yellow\",\n" +
            "      \"birth_year\": \"112BBY\",\n" +
            "      \"gender\": \"n/a\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/2/\",\n" +
            "        \"https://swapi.dev/api/films/3/\",\n" +
            "        \"https://swapi.dev/api/films/4/\",\n" +
            "        \"https://swapi.dev/api/films/5/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \"https://swapi.dev/api/species/2/\"\n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:10:51.357000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.309000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/2/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"R2-D2\",\n" +
            "      \"height\": \"96\",\n" +
            "      \"mass\": \"32\",\n" +
            "      \"hair_color\": \"n/a\",\n" +
            "      \"skin_color\": \"white, blue\",\n" +
            "      \"eye_color\": \"red\",\n" +
            "      \"birth_year\": \"33BBY\",\n" +
            "      \"gender\": \"n/a\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/8/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/2/\",\n" +
            "        \"https://swapi.dev/api/films/3/\",\n" +
            "        \"https://swapi.dev/api/films/4/\",\n" +
            "        \"https://swapi.dev/api/films/5/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \"https://swapi.dev/api/species/2/\"\n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:11:50.376000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.311000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/3/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Darth Vader\",\n" +
            "      \"height\": \"202\",\n" +
            "      \"mass\": \"136\",\n" +
            "      \"hair_color\": \"none\",\n" +
            "      \"skin_color\": \"white\",\n" +
            "      \"eye_color\": \"yellow\",\n" +
            "      \"birth_year\": \"41.9BBY\",\n" +
            "      \"gender\": \"male\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/2/\",\n" +
            "        \"https://swapi.dev/api/films/3/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \"https://swapi.dev/api/starships/13/\"\n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:18:20.704000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.313000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/4/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Leia Organa\",\n" +
            "      \"height\": \"150\",\n" +
            "      \"mass\": \"49\",\n" +
            "      \"hair_color\": \"brown\",\n" +
            "      \"skin_color\": \"light\",\n" +
            "      \"eye_color\": \"brown\",\n" +
            "      \"birth_year\": \"19BBY\",\n" +
            "      \"gender\": \"female\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/2/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/2/\",\n" +
            "        \"https://swapi.dev/api/films/3/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \"https://swapi.dev/api/vehicles/30/\"\n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:20:09.791000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.315000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/5/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Owen Lars\",\n" +
            "      \"height\": \"178\",\n" +
            "      \"mass\": \"120\",\n" +
            "      \"hair_color\": \"brown, grey\",\n" +
            "      \"skin_color\": \"light\",\n" +
            "      \"eye_color\": \"blue\",\n" +
            "      \"birth_year\": \"52BBY\",\n" +
            "      \"gender\": \"male\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/5/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:52:14.024000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.317000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/6/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Beru Whitesun lars\",\n" +
            "      \"height\": \"165\",\n" +
            "      \"mass\": \"75\",\n" +
            "      \"hair_color\": \"brown\",\n" +
            "      \"skin_color\": \"light\",\n" +
            "      \"eye_color\": \"blue\",\n" +
            "      \"birth_year\": \"47BBY\",\n" +
            "      \"gender\": \"female\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/5/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:53:41.121000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.319000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/7/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"R5-D4\",\n" +
            "      \"height\": \"97\",\n" +
            "      \"mass\": \"32\",\n" +
            "      \"hair_color\": \"n/a\",\n" +
            "      \"skin_color\": \"white, red\",\n" +
            "      \"eye_color\": \"red\",\n" +
            "      \"birth_year\": \"unknown\",\n" +
            "      \"gender\": \"n/a\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \"https://swapi.dev/api/species/2/\"\n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:57:50.959000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.321000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/8/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Biggs Darklighter\",\n" +
            "      \"height\": \"183\",\n" +
            "      \"mass\": \"84\",\n" +
            "      \"hair_color\": \"black\",\n" +
            "      \"skin_color\": \"light\",\n" +
            "      \"eye_color\": \"brown\",\n" +
            "      \"birth_year\": \"24BBY\",\n" +
            "      \"gender\": \"male\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/1/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \"https://swapi.dev/api/starships/12/\"\n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T15:59:50.509000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.323000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/9/\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Obi-Wan Kenobi\",\n" +
            "      \"height\": \"182\",\n" +
            "      \"mass\": \"77\",\n" +
            "      \"hair_color\": \"auburn, white\",\n" +
            "      \"skin_color\": \"fair\",\n" +
            "      \"eye_color\": \"blue-gray\",\n" +
            "      \"birth_year\": \"57BBY\",\n" +
            "      \"gender\": \"male\",\n" +
            "      \"homeworld\": \"https://swapi.dev/api/planets/20/\",\n" +
            "      \"films\": [\n" +
            "        \"https://swapi.dev/api/films/1/\",\n" +
            "        \"https://swapi.dev/api/films/2/\",\n" +
            "        \"https://swapi.dev/api/films/3/\",\n" +
            "        \"https://swapi.dev/api/films/4/\",\n" +
            "        \"https://swapi.dev/api/films/5/\",\n" +
            "        \"https://swapi.dev/api/films/6/\"\n" +
            "      ],\n" +
            "      \"species\": [\n" +
            "        \n" +
            "      ],\n" +
            "      \"vehicles\": [\n" +
            "        \"https://swapi.dev/api/vehicles/38/\"\n" +
            "      ],\n" +
            "      \"starships\": [\n" +
            "        \"https://swapi.dev/api/starships/48/\",\n" +
            "        \"https://swapi.dev/api/starships/59/\",\n" +
            "        \"https://swapi.dev/api/starships/64/\",\n" +
            "        \"https://swapi.dev/api/starships/65/\",\n" +
            "        \"https://swapi.dev/api/starships/74/\"\n" +
            "      ],\n" +
            "      \"created\": \"2014-12-10T16:16:29.192000Z\",\n" +
            "      \"edited\": \"2014-12-20T21:17:50.325000Z\",\n" +
            "      \"url\": \"https://swapi.dev/api/people/10/\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static String getPersonList() {
        return RESPONSE;
    }
}
