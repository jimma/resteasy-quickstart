package org.resteasy.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;

@Path("/")
public class MetricsEndpoint
{
   @GET
   @Path("/mpinfo")
   @Produces(MediaType.APPLICATION_JSON)
   @Timed(name = "getMPMetricsInfoTimed", description = "Metrics to monitor the times spent in getMPMetricsInfo method", unit = MetricUnits.NANOSECONDS, absolute = true)
   @Counted(description = "counter of the getMPMetricsInfo method", absolute = true)
   public String getMPMetricsInfo()
   {
      return "MicrpProfle Metrics API 2.3";
   }
}
