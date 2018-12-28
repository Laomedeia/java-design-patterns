package com.iluwatar.abstractdocument.mydomain;

import com.iluwatar.abstractdocument.AbstractDocument;
import com.iluwatar.abstractdocument.domain.HasModel;
import com.iluwatar.abstractdocument.domain.HasParts;
import com.iluwatar.abstractdocument.domain.HasPrice;

import java.util.Map;

/**
 * @author neptune
 * @create 2018 12 28 15:37
 */
public class Plane extends AbstractDocument implements HasModel, HasPrice, HasParts {

    public Plane(Map<String, Object> properties) {
        super(properties);
    }
}
