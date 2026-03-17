package co.istad.lily.a01a1webmvc.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "order_lines")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderLineId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order oder;

    @ManyToOne
    private Product product;
    private Integer qty;
    private BigDecimal unitPrice;
    private Float discount;

}
