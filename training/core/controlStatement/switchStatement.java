package training.core.controlStatement;

import training.core.Day;

public class switchStatement {

    public static void main(String[] args) {
        currentSeasonName(3);
        currentSeasonNumber("Summer");
        amountOfDaysInMoth(5);
        whatDoYouThinkAbout(Day.MONDAY);        // użycie 'klasy' enum o nazwie Day

    }

    private static void whatDoYouThinkAbout(Day dayOfWeek) {
        System.out.println(dayOfWeek + " statistic: ");
        dayOfWeek.DayNumber();
        dayOfWeek.ShortName();
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("It sucks!!");
                break;
            case TUESDAY:
                System.out.println("It sucks!");
                break;
            case WEDNESDAY:
                System.out.println("Ugh.");
                break;
            case THURSDAY:
                System.out.println("Almost...");
                break;
            case FRIDAY:
                System.out.println("Hang on there!!");
                break;
            case SATURDAY:
                System.out.println("Fck Yeah!!!");
                break;
            case SUNDAY:
                System.out.println("Goddamit!!");
        }
    }

    private static void amountOfDaysInMoth(int month) {
        // 2 - 28
        // 1,3,5,7,8,10,12 - 31
        // 4,6,9,11 - 30

        switch (month) {
            case 2:
                System.out.println("28/29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Out of range!");
        }
    }

    private static void currentSeasonNumber(String seasonName) {
        switch (seasonName.toLowerCase()) {
            case "summer":
                System.out.println("Season No.:1");
                break;
            case "autumn":
                System.out.println("Season No.: 2");
                break;
            case "winter":
                System.out.println("Seaon No.: 3");
                break;
            case "Spring":
                System.out.println("Season No.: 4");
                break;
            default:
                System.out.println("Not exists!!!");
        }


    }

    private static void currentSeasonName(int seasonNumber) {
        switch (seasonNumber) {
            case 1:
                System.out.println("Summer");
                break;
            case 2:
                System.out.println("Autumn");
                break;
            case 3:
                System.out.println("Winter");
                break;
            case 4:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Not exists!!!");
        }
    }
}
