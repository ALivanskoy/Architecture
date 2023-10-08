using ClinicService.Models.Requests;
using ClinicService.Models;
using ClinicService.Services;
using ClinicService.Services.Impl;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace ClinicService.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PetController : ControllerBase
    {

        private readonly IPetRepository _petRepository;

        public PetController(IPetRepository petRepository)
        {
            _petRepository = petRepository;
        }

        [HttpPost("create")]
        public IActionResult Create([FromBody] CreatePetRequest createRequest)
        {
            int res = _petRepository.Create(new Pet
            {
                Name = createRequest.Name,
                Birthday = createRequest.Birthday
            });
            return Ok(res);
        }

        [HttpPut("update")]
        public IActionResult Update([FromBody] UpdateClientRequest updateRequest)
        {
            int res = _clientRepository.Update(new Pet
            {
                Name = createRequest.Name,
                Birthday = createRequest.Birthday,
            });
            return Ok(res);
        }

        [HttpDelete("delete")]
        public IActionResult Delete([FromQuery] int clientId)
        {
            int res = _petRepository.Delete(clientId);
            return Ok(res);
        }

        [HttpGet("get-all")]
        public IActionResult GetAll()
        {
            return Ok(_petRepository.GetAll());
        }


        [HttpGet("get/{petId}")]
        public IActionResult GetById([FromRoute] int petId)
        {
            return Ok(_petRepository.GetById(petId));
        }
    }
}
