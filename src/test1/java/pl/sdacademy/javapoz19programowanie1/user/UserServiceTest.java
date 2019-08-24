package pl.sdacademy.javapoz19programowanie1.user;

import org.junit.Assert;
import org.junit.Test;
import pl.user.Gender;
import pl.user.User;
import pl.user.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceTest {

    @Test
    public void findByGenderShouldReturnFilteredList() {
        UserService userService = new UserService();

        List<User> list = userService.findByGender(Gender.female);

        Assert.assertEquals("Lista powinna zawierać 3 elementy", 3, list.size());

        Assert.assertTrue("Wszystkie argumenty powinny mieć wartość female", list.stream()
                .map(user -> user.getGender())
                .allMatch(gender -> gender.equals(Gender.female)));

    }

    @Test
    public void mapToNamesShouldReturnListWithNames() {
        UserService userService = new UserService();

        List<String> names = userService.mapToNames();

        Assert.assertEquals(Arrays.asList("Bird Ramsey"
                , "Lillian Burgess"
                , "Kristie Cole"
                , "Leonor Cross"
                , "Marsh Mccall"), names);
    }

    @Test
    public void sortByAgeShouldReturnSortedByAgeListOfUsers() {

        UserService userService = new UserService();

        List<User> users = userService.sortByAge();

        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void sortByBalanceShoudReturnSortedByAgeListOfUsers() {
        UserService userService = new UserService();

        List<User> users = userService.sortByBalance();

        users.forEach(user -> System.out.println(user));

    }

    @Test
    public void avgBalanceShouldReturnAvgValue() {
        UserService userService = new UserService();

        double avgBalance = userService.avgBalance();

        Assert.assertEquals(290318.2, avgBalance, 0.1);

//        System.out.println(avgBalance);
    }

    @Test
    public void findWithHighestBalanceShouldReturnUserWithHighestBalance() {
        UserService userService = new UserService();

        User withHighestBalance = userService.findWithHighestBalance();

        Assert.assertEquals(Long.valueOf(394645), withHighestBalance.getBalance());
    }
}
