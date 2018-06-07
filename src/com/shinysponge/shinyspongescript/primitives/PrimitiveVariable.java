package com.shinysponge.shinyspongescript.primitives;

import com.shinysponge.shinyspongescript.objects.SSSVariable;

public class PrimitiveVariable<T> extends SSSVariable<T> {

  public PrimitiveVariable(String name, T value) {
    super(name, value);
  }
}
