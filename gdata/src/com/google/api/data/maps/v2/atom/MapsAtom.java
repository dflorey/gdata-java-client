// Copyright 2010 Google Inc. All Rights Reserved.

package com.google.api.data.maps.v2.atom;

import com.google.api.data.client.v2.atom.NamespaceDictionary;

public final class MapsAtom {

  public static final NamespaceDictionary NAMESPACE_DICTIONARY;
  static {
    NamespaceDictionary.Builder builder = new NamespaceDictionary.Builder();
    builder.addNamespace("", "http://www.w3.org/2005/Atom");
    builder.addNamespace("app", "http://www.w3.org/2007/app");
    builder.addNamespace("gAcl", "http://schemas.google.com/acl/2007");
    builder.addNamespace("openSearch", "http://a9.com/-/spec/opensearch/1.1/");
    NAMESPACE_DICTIONARY = builder.build();
  }

  private MapsAtom() {
  }
}