package filter;

import utils.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CriterialFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        if (CollectionUtils.isNotEmpty(people)) {
            return people.stream().filter(item -> "FEMALE".equalsIgnoreCase(item.getGender())).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }
}
