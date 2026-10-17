package streams.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Using Stream API extract message in the correct Chronological order from given log data in formate "HH:MM:ID: Message"
public class ExtractMessagesInChronologicalOrder {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
          "14:30:3:Server started",
          "14:30:1:User Logged in",
          "14:29:2:Database connected",
          "18:32:4:User Logged out"

        );

        List<String> list = logs.stream().sorted((log1, log2) ->
        {
            String[] part1 = log1.split(":");
            String[] part2 = log2.split(":");

            int hour1 = Integer.parseInt(part1[0]);
            int min1 = Integer.parseInt(part1[1]);
            int id1 = Integer.parseInt(part1[2]);

            int hour2 = Integer.parseInt(part2[0]);
            int min2 = Integer.parseInt(part2[1]);
            int id2 = Integer.parseInt(part2 [2]);

            if (hour1 != hour2)
                return Integer.compare(hour1, hour2);
            if (min1 != min2)
                return Integer.compare(min1, min2);
            return Integer.compare(id1, id2);

        }).map(log -> log.split(":", 4)[3]).toList();
        System.out.println(list);


        //2nd way
        List<String> list1 = logs.stream().sorted(Comparator.comparing((String log) -> log.split(":")[0])
                        .thenComparing(log -> log.split(":")[1])
                        .thenComparing(log -> Integer.parseInt(log.split(":")[2])))
                .map(log -> log.split(":", 4)[3])
                .toList();
        System.out.println(list1);


    }
}
