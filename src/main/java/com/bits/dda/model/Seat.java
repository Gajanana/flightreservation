package com.bits.dda.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Table;

@Table()
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Seat {
}
