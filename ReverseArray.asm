;TITLE Reverse Array
;Name: Mark Burnette

INCLUDE Irvine32.inc

.model flat,stdcall

.data
array DWORD 1,2,3,4,5
lengt DWORD LENGTHOF array / 2
temp DWORD 0
;.model flat,stdcall

.code
main proc
	mov eax, 0
	mov ebx, 0
	mov esi, 0
	mov edi, 0
	mov ecx, 0
	
	mov esi, OFFSET array
	mov edi, OFFSET array + (SIZEOF array - TYPE array)
	mov ecx, lengt

	ArrayLoop:
		mov eax, [esi]
		mov ebx, [edi]

		mov temp, ebx
		mov ebx, eax
		mov eax, temp

		mov [esi], eax
		mov [edi], ebx

		add esi, TYPE array
		sub edi, TYPE array
		mov temp, 0
		loop ArrayLoop

	mov esi, OFFSET array
	;mov edi, OFFSET array
	call DumpMem

main endp
end main