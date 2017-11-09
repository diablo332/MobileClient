/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package kz.pnhz.iserver.thrift.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ThriftDocumentType implements org.apache.thrift.TEnum {
  INCOMING(0),
  OUTGOING(1),
  INTERNAL(2),
  ORDER(3),
  CONTRACT(4);

  private final int value;

  private ThriftDocumentType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftDocumentType findByValue(int value) { 
    switch (value) {
      case 0:
        return INCOMING;
      case 1:
        return OUTGOING;
      case 2:
        return INTERNAL;
      case 3:
        return ORDER;
      case 4:
        return CONTRACT;
      default:
        return null;
    }
  }
}
