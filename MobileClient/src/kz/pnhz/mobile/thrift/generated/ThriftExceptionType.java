/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package kz.pnhz.mobile.thrift.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ThriftExceptionType implements org.apache.thrift.TEnum {
  SERVICE_VERSION_MISMATCH(0),
  AUTHENTICATION_FAILED(1),
  UNDEFINED(2);

  private final int value;

  private ThriftExceptionType(int value) {
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
  public static ThriftExceptionType findByValue(int value) { 
    switch (value) {
      case 0:
        return SERVICE_VERSION_MISMATCH;
      case 1:
        return AUTHENTICATION_FAILED;
      case 2:
        return UNDEFINED;
      default:
        return null;
    }
  }
}
