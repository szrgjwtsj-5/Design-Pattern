package filter;

import java.util.List;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {

    private Criteria criteria, otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> res1 = criteria.meetCriteria(people);
        List<Person> res2 = otherCriteria.meetCriteria(people);

        if (res2 != null && !res2.isEmpty()) {
            res1.addAll(res2);
        }

        return res1.stream().distinct().collect(Collectors.toList());
    }
}
