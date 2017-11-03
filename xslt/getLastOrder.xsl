<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
  <h2>Last Order Information</h2>
  <table border="1">
    <tr bgcolor="#9acd32">
      <th>Id</th>
      <th>Name</th>
      <th>Price</th>
      <th>Description</th>
      <th>Location</th>
      <th>Staus</th>
      <th>Note</th>
      <th>Responsible Name</th>
      <th>Order Number</th>
      <th>Company Name</th>
      <th>Company Address</th>
    </tr>
    <xsl:for-each select="itemInformation/item">
    <tr>
      <td><xsl:value-of select="@id"/></td>
      <td><xsl:value-of select="name"/></td>
      <td><xsl:value-of select="price"/></td>
      <td><xsl:value-of select="description"/></td>
      <td><xsl:value-of select="location"/></td>
      <td><xsl:value-of select="status"/></td>
      <td><xsl:value-of select="note"/></td>
      <td><xsl:value-of select="responsible_name"/></td>
      <td><xsl:value-of select="order_number"/></td>
      <td><xsl:value-of select="company_name"/></td>
      <td><xsl:value-of select="company_address"/></td>
    </tr>
    </xsl:for-each>
  </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>
