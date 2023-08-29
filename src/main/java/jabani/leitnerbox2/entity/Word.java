package jabani.leitnerbox2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "WORDS")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "WORD")
    private String word;
    @Column(name = "MEANING")
    private String meaning;
    @Column(name = "SAMPLE")
    private String sample;
}
