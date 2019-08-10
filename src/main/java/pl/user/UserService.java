package pl.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class UserService {


    private List<User> users;

    public void UnitService() {

    }

    private void init() {
        this.users = Arrays.asList(
                new User("Bird Ramsey", Gender.male, "$3,946.45", 23),
                new User("Lillian Burgess", Gender.female, "$2,499.49", 31),
                new User("Kristie Cole", Gender.female, "$2,820.18", 34),
                new User("Leonor Cross", Gender.female, "$3,277.32", 30),
                new User("Marsh Mccall", Gender.male, "$1,972.47", 28)
        );
    }

    public List<User> findByGender(Gender gender) {
        users.stream()
                .filter(user -> user.getGender().equals(gender))
                .collect(Collectors.toList());

    }

}
