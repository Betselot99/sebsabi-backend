package et.com.gebeya.safaricom.coreservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "testimonials")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Testimonial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnoreProperties(value = {"id", "email", "password", "profileImage", "createdAt", "updatedAt", "isActive", "companyName", "companyType", "occupation", "forms", "testimonials", "ratings"})
    private Client client;

    @ManyToOne
    @JoinColumn(name = "gig_worker_id")
    @JsonIgnore
    private GigWorker gigWorker;

    // Constructors, getters, and setters
}