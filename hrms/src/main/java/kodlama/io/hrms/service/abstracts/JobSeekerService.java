package kodlama.io.hrms.service.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;

import java.util.List;
public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
}
