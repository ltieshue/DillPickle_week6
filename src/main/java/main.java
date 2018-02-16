import static spark.Spark.*;


public class main {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            response.redirect("/index.html");
            return null;
        });
        get("/peopleList", (request, response) -> {
            response.type("application/json");
            return "{\"people\": [\n" +
                    "  {\"name\": \"Scott\", \"comment\": \"I like how you explain code.\"},\n" +
                    "  {\"name\": \"Koddie\", \"comment\": \"Thanks to Koddie for the new snacks!\"},\n" +
                    "  {\"name\": \"Mark\", \"comment\": \"Shout out to Mark! He's a great partner to work with.\"},\n" +
                    "  {\"name\": \"Ted\", \"comment\": \"Ted helped me to better understand my weekend challenge.\"},\n" +
                    "  {\"name\": \"Joan\", \"comment\": \"Joan helped me better understand the mini challenge.\"},\n" +
                    "  {\"name\": \"Lori\", \"comment\": \"I think Lori is thinking like a programmer and asking great questions.\"},\n" +
                    "  {\"name\": \"Manny\", \"comment\": \"Manny his patience and explanations helped me process the peer challenge.\"},\n" +
                    "  {\"name\": \"Zech\", \"comment\": \"Zech walked me through each step and explained things that were confusing to me.\"},\n" +
                    "  {\"name\": \"Kym\", \"comment\": \"Kym was helpful and patient.\"},\n" +
                    "  {\"name\": \"Jake\", \"comment\": \"Shout out to Jake for working out our group challenge on the timer project.\"}\n" +
                    "]}";

        });

    }
}

