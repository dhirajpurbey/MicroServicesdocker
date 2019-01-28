package com.stackroute.Muzix.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




//import javax.persistence.*;

@Document(collection="Tracks")
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Track
{
    @Id
    private int trackId;

    private String trackName;

    private String comment;

//    public Track( String trackName, String comment) {
//        this.trackName = trackName;
//        this.comment = comment;
//    }
}
