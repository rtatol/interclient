/*
 * The contents of this file are subject to the Interbase Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy
 * of the License at http://www.Inprise.com/IPL.html
 *
 * Software distributed under the License is distributed on an
 * "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * The Original Code was created by Inprise Corporation
 * and its predecessors. Portions created by Inprise Corporation are
 * Copyright (C) Inprise Corporation.
 * All Rights Reserved.
 * Contributor(s): ______________________________________.
 */
package interbase.interclient;
/**
 * <p>
 * A complete list of IANA encodings may be found at
 * <a href="ftp://ftp.isi.edu/in-notes/iana/assignments/character-sets">
 * ftp://ftp.isi.edu/in-notes/iana/assignments/character-sets</a>.
 * The InterBase name for the IANA character encoding may
 * be obtained by calling
 * {@link #getInterBaseCharacterSetName getInterBaseCharacterSetName()}.
 * <p>
 * Any of the following character encodings may be specified
 * on connection using the <code>charSet</code> connection property.
 * It is recommended to use one of the static final encoding
 * variables below
 * rather than using hardwired encoding names in your application.
 * The actual encoding names represented by these variables could
 * change from one release to the next.
 * <p>
 * See <a href="../../../help/icConnectionProperties.html">DataSource Properties</a>
 * for a description of the <code>charSet</code> connection property.
 *
 * @since <font color=red>Extension, since InterClient 1.50</font>
public final class CharacterEncodings
{
  // This is a static class, so define a private
  // constructor so that the default constructor

  // *** InterBase Character Sets ***
  // ********************************

  // NONE is the default and is used by result set to assign metadata charset.

  private static final int OCTETS__ = 1;
  private static final int ASCII__ = 2;
  private static final int UNICODE_FSS__ = 3;
  private static final int ISO8859_1__ = 21; // aka LATIN-1
  private static final int BIG_5__ = 56;
  private static final int CYRL__ = 50;
  private static final int DOS437__ = 10;
  private static final int DOS850__ = 11;
  private static final int DOS852__ = 45;
  private static final int DOS857__ = 46;
  private static final int DOS860__ = 13;
  private static final int DOS861__ = 47;
  private static final int DOS863__ = 14;
  private static final int DOS865__ = 12;
  private static final int EUCJ_0208__ = 6;
  private static final int GB_2312__ = 57;
  private static final int KSC_5601__ = 44;
  private static final int NEXT__ = 19;
  private static final int SJIS_0208__ = 5;
  private static final int WIN1250__ = 51;
  private static final int WIN1251__ = 52;
  private static final int WIN1252__ = 53;
  private static final int WIN1253__ = 54;
  private static final int WIN1254__ = 55;
  /**
   * Represents the value "NONE".
   * <p>
  /**

  /**
  /**
  /**
  /**
  /**
  /**
  /**
   * PC Turkish.
  /**

  /**

  /**

   * The InterBase character set name is <code>GB_2312</code>.

   * Represents the IANA name <code>KS_C_5601-1987</code>.
   * The InterBase character set name is also <code>KSC_5601</code>.
  public final static String MS949 = "MS949";//!kna

  /**
   * PC and Windows Japanese.
  **/
  public final static String MS932 = "MS932";//!kna

  /**
  private final static String[] supportedEncodings__ =
  static {
  /**

  /**