package com.market.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderController {

  private final OrderService orderService;

  @GetMapping("/order/{id}")
  public String order(@PathVariable("id") String id) {

    orderService.createOrder(id);

    return "Order Complete #" + id;
  }


}
