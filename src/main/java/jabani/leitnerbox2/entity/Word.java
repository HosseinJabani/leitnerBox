package jabani.leitnerbox2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Entity
@Table(name = "WORDS")
public class Word {
    public Word(){}
    public Word(String word, String meaning, String sample){
        this.word = word;
        this.meaning = meaning;
        this.sample = sample;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hossein")
    @SequenceGenerator(
            name = "hossein",
            initialValue = 2,
            allocationSize = 1 //step size that didn't work on my Oracle db!
    )
    private Long id;
    @Column(name = "WORD")
    private String word;
    @Column(name = "MEANING")
    private String meaning;
    @Column(name = "SAMPLE")
    private String sample;
    @CreationTimestamp //Hibernate take care of creation time stamp
    private LocalDateTime creationDate;
    @UpdateTimestamp //Hibernate take care of updating time stamp
    private LocalDateTime lastUpdate;
}
