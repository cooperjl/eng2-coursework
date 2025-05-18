package uk.ac.york.eng2.products.offers.conditions;

import io.micronaut.context.annotation.Primary;
import io.micronaut.context.annotation.Prototype;
import uk.ac.york.eng2.products.dto.OrderPricingDTO;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

import static java.util.Objects.isNull;

@Primary
@Prototype
public class DateRangeCondition {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");

    protected Date startDate;
    protected Date endDate;

    public DateRangeCondition() {}

    public boolean eval(OrderPricingDTO order) {
        Date dateCreated = order.getDateCreated();
        // Ignore the discount if wrongly configured
        if (isNull(startDate) || isNull(endDate)) {
            return false;
        }
        return dateCreated.after(startDate) && dateCreated.before(endDate);
    }

    public void setStartDate(String startDateString) {
        try {
            this.startDate = dateFormat.parse(startDateString);
        } catch (ParseException e) {
            // This should only happen if the model's generated code is wrong.
            e.printStackTrace();
        }
    }
    public void setEndDate(String endDateString) {
        try {
            this.endDate = dateFormat.parse(endDateString);
        } catch (ParseException e) {
            // This should only happen if the model's generated code is wrong.
            e.printStackTrace();
        }
    }

}
