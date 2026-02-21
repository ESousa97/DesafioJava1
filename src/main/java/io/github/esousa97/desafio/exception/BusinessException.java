package io.github.esousa97.desafio.exception;

public class BusinessException extends RuntimeException {
  private final String code;

  public BusinessException(final String code, final String message) {
    super(message);
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
