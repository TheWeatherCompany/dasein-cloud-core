package org.dasein.cloud.identity;

import javax.annotation.Nonnull;

/**
 * Options for assuming a temporary role within a cloud provider account.
 *
 * @author Cameron Stokes (http://github.com/clstokes)
 * @since 2013-10-04
 */
public class AssumeRoleOptions {

  /**
   * Constructs a basic options class with only role specified.
   *
   * @param providerRoleId the role id from the provider
   * @return an options class
   */
  @Nonnull
  static public AssumeRoleOptions getInstance( @Nonnull String providerRoleId, @Nonnull String sessionName ) {
    return new AssumeRoleOptions( providerRoleId, sessionName );
  }

  private String providerRoleId;
  private String sessionName;

  @Nonnull
  public String getProviderRoleId() {
    return providerRoleId;
  }

  @Nonnull
  public String getSessionName() {
    return sessionName;
  }

  private AssumeRoleOptions( @Nonnull String providerRoleId, @Nonnull String sessionName ) {
    this.providerRoleId = providerRoleId;
    this.sessionName = sessionName;
  }

}
