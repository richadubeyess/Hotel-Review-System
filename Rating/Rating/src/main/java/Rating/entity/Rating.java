package Rating.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_rating")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    @Id
    private String ratingId;

    private int rating;
    private String feedback;
    private Long userId;
    private Long hotelId;
}